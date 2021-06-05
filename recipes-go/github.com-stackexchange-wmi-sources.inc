SRC_URI += "git://github.com/StackExchange/wmi;nobranch=1;protocol=https;srcinput=github.com/StackExchange/wmi;srcoutput=github.com/StackExchange/wmi;destsuffix=github.com/StackExchange/wmi;name=github-com-stackexchange-wmi"
SRCREV_github-com-stackexchange-wmi = "fe8f1750fd46057fb58f854c1d35205bed539913"
UPSTREAM_CHECK_COMMITS = "1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/StackExchange/wmi/LICENSE;md5=7e64b32a93ebf1d28071bfd302098152 \
"

GOSRC_INCLUDEGUARD += "github.com-stackexchange-wmi-sources.inc"

