import axios from 'axios'

const CUSTOMERS_REST_API_URL='https://localhost:8091/api/customers';

class Customerservice
{
    getCustomers(){
         return axios.get(CUSTOMERS_REST_API_URL);
    }
}

export default new Customerservice();