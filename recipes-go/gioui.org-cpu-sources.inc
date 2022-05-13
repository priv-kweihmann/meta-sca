SRC_URI += "https://proxy.golang.org/gioui.org/cpu/@v/v0.0.0-20220412190645-f1e9e8c3b1f7.zip;srcoutput=gioui.org/cpu;srcinput=gioui.org/cpu@v0.0.0-20220412190645-f1e9e8c3b1f7;downloadfilename=gioui-org-cpu-0.0.0-20220412190645-f1e9e8c3b1f7.zip;name=gioui-org-cpu"
SRC_URI[gioui-org-cpu.sha256sum] = "f3fb63228b664af3a5fa0b24df0b8cc383c3fa24126b293aa48080c60e235795"
GOSRC_REMOVEDIRS += "gioui.org/cpu/cmd/example"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/gioui.org/cpu/LICENSE;md5=dde5f9fd8ce48e8651e625128022e572 \
"

GOSRC_INCLUDEGUARD += "gioui.org-cpu-sources.inc"

