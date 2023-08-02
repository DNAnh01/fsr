const init = {
    cars: ['BMW']
}
// view -> action -> dispatch
export default function reducer(state = init, action, args) {  
    console.log(action, args);
    console.log(state);
    
    switch (action) {
        
        case "ADD":
            const [newCar] = args;
            return {
                ...state,
                cars: [...state.cars, newCar]
            };
        default:
            return state;
    }
    console.log(state);
}