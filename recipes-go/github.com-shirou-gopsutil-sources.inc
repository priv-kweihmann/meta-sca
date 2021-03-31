SRC_URI_append = " https://proxy.golang.org/github.com/shirou/gopsutil/@v/v3.21.2+incompatible.zip;srcoutput=github.com/shirou/gopsutil;srcinput=github.com/shirou/gopsutil@v3.21.2+incompatible;downloadfilename=github-com-shirou-gopsutil-3.21.2+incompatible.zip;name=github-com-shirou-gopsutil"
SRC_URI[github-com-shirou-gopsutil.sha256sum] = "dac1a7b16af7fb6e57ca36d898c97ec38772b88f1ff4d7b65c9140c5e2a747a9"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/shirou/gopsutil/LICENSE;md5=ed7522382cec5b7a6d6ebb8e30eed40e \
"
