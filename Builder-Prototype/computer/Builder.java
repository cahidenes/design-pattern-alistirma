package org.example.computer;

import org.example.part.*;

public interface Builder {
    public Builder addHDD(HDD hdd);
    public Builder addSSD(SSD ssd);
    public Builder addRAM(RAM ram);
    public Builder addCPU(CPU cpu);
    public Builder addGPU(GPU gpu);
    public Object build();
}
