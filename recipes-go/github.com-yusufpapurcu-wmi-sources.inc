SRC_URI += "https://proxy.golang.org/github.com/yusufpapurcu/wmi/@v/v1.2.2.zip;srcoutput=github.com/yusufpapurcu/wmi;srcinput=github.com/yusufpapurcu/wmi@v1.2.2;downloadfilename=github-com-yusufpapurcu-wmi-1.2.2.zip;name=github-com-yusufpapurcu-wmi"
SRC_URI[github-com-yusufpapurcu-wmi.sha256sum] = "5fe3e595564a38f7ba71acf4646ebdf542a1da8fa3afb116afb0fbec0cffe9b1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yusufpapurcu/wmi/LICENSE;md5=7e64b32a93ebf1d28071bfd302098152 \
"

GOSRC_INCLUDEGUARD += "github.com-yusufpapurcu-wmi-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-ole-go-ole-sources.inc', '', 'github.com-go-ole-go-ole-sources.inc', d)}
