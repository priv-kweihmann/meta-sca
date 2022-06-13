SRC_URI += "https://proxy.golang.org/honnef.co/go/js/dom/@v/v0.0.0-20210725211120-f030747120f2.zip;srcoutput=honnef.co/go/js/dom;srcinput=honnef.co/go/js/dom@v0.0.0-20210725211120-f030747120f2;downloadfilename=honnef-co-go-js-dom-0.0.0-20210725211120-f030747120f2.zip;name=honnef-co-go-js-dom"
SRC_URI[honnef-co-go-js-dom.sha256sum] = "4470b3abd3e95f41705b43a3346570bc4d9beb2924fb1e70c7137502afb57bc2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/honnef.co/go/js/dom/LICENSE;md5=aef5feb5b64b5eb238f2f1cfd67b9822 \
"

GOSRC_INCLUDEGUARD += "honnef.co-go-js-dom-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
