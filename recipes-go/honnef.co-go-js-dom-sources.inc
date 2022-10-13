SRC_URI += "https://proxy.golang.org/honnef.co/go/js/dom/@v/v0.0.0-20221001195520-26252dedbe70.zip;srcoutput=honnef.co/go/js/dom;srcinput=honnef.co/go/js/dom@v0.0.0-20221001195520-26252dedbe70;downloadfilename=honnef-co-go-js-dom-0.0.0-20221001195520-26252dedbe70.zip;name=honnef-co-go-js-dom"
SRC_URI[honnef-co-go-js-dom.sha256sum] = "9249d376b4125c9d80fd2e3ea59c31c657220d02dd0d6cfa16503a02cafebf8f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/honnef.co/go/js/dom/LICENSE;md5=aef5feb5b64b5eb238f2f1cfd67b9822 \
"

GOSRC_INCLUDEGUARD += "honnef.co-go-js-dom-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
