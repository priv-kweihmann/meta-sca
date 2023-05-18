SRC_URI += "https://proxy.golang.org/github.com/campoy/embedmd/@v/v1.0.0.zip;srcoutput=github.com/campoy/embedmd;srcinput=github.com/campoy/embedmd@v1.0.0;downloadfilename=github-com-campoy-embedmd-1.0.0.zip;name=github-com-campoy-embedmd"
SRC_URI[github-com-campoy-embedmd.sha256sum] = "a0e0daed0e40d30dfaf7ba58bc8057450f5c1964d5672c49d3b4817a82f9a512"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/campoy/embedmd/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
"

GOSRC_INCLUDEGUARD += "github.com-campoy-embedmd-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pmezard-go-difflib-sources.inc', '', 'github.com-pmezard-go-difflib-sources.inc', d)}
