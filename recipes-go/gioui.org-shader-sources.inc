SRC_URI += "https://proxy.golang.org/gioui.org/shader/@v/v1.0.6.zip;srcoutput=gioui.org/shader;srcinput=gioui.org/shader@v1.0.6;downloadfilename=gioui-org-shader-1.0.6.zip;name=gioui-org-shader"
SRC_URI[gioui-org-shader.sha256sum] = "6597c17aff165e8666262dc3efc447687dbe306d23ca01ac3f680fbdfab70d2f"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/gioui.org/shader/LICENSE;md5=dde5f9fd8ce48e8651e625128022e572 \
"

GOSRC_INCLUDEGUARD += "gioui.org-shader-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-cpu-sources.inc', '', 'gioui.org-cpu-sources.inc', d)}
