SRC_URI += "https://proxy.golang.org/github.com/goccy/go-json/@v/v0.10.2.zip;srcoutput=github.com/goccy/go-json;srcinput=github.com/goccy/go-json@v0.10.2;downloadfilename=github-com-goccy-go-json-0.10.2.zip;name=github-com-goccy-go-json"
SRC_URI[github-com-goccy-go-json.sha256sum] = "ed9043ee01cc46557c74bcecc625db37ffe3a5c7af219f390a287f44a40c2520"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/goccy/go-json/LICENSE;md5=33a07164132d795872805bfc53f6097d \
"

GOSRC_INCLUDEGUARD += "github.com-goccy-go-json-sources.inc"

