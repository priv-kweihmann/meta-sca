SRC_URI += "https://proxy.golang.org/github.com/gorilla/handlers/@v/v1.5.1.zip;srcoutput=github.com/gorilla/handlers;srcinput=github.com/gorilla/handlers@v1.5.1;downloadfilename=github-com-gorilla-handlers-1.5.1.zip;name=github-com-gorilla-handlers"
SRC_URI[github-com-gorilla-handlers.sha256sum] = "700cb5572cef0b4c251fc63550d3a656d53b91cec845f19b6a16bdbc6795beec"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gorilla/handlers/LICENSE;md5=8b3b447b874e027144fab9fe470c4a57 \
"

GOSRC_INCLUDEGUARD += "github.com-gorilla-handlers-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-felixge-httpsnoop-sources.inc', '', 'github.com-felixge-httpsnoop-sources.inc', d)}
