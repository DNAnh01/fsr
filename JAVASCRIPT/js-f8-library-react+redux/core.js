export default function html([first, ...strings], ...values) { 
    return values.reduce((acc, cur) => 
        acc.concat(cur, strings.shift()),
        [first]
    )
    .filter(x => x && x !== true || x === 0 )
    .join('')
}

export function createStore(reducer) {  
    // trong trường hợp mặc định thì sẽ trả về state ban đầu
    let state = reducer();
    const roots = new Map();

    function render(param) {  
        for(const [root, component] of roots) {
            const output = component();
            root.innerHTML = output;
        }
    }

    return {
        attach(component, root) {
            // set root is a key and component is a value
            roots.set(root, component);
            render();
        },
        // đẩy dữ liệu từ store vào view
        connect(selector = state => state) {
            return component => (props, ...args) => 
            component(Object.assign({}, props, selector(state), ...args)); 
        },
        
        dispatch(action, ...args) {
            state = reducer(state, action, args);
            render();
        }
    }
}