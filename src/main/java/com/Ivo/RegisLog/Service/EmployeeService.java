package com.Ivo.RegisLog.Service;
import com.Ivo.RegisLog.Dto.EmployeeDTO;
import com.Ivo.RegisLog.Dto.LoginDTO;
import com.Ivo.RegisLog.payload.response.LoginMessage;
public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMessage loginEmployee(LoginDTO loginDTO);

}
