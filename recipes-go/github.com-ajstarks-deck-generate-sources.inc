SRC_URI += "https://proxy.golang.org/github.com/ajstarks/deck/generate/@v/v0.0.0-20220504212752-e4bcd985d902.zip;srcoutput=github.com/ajstarks/deck/generate;srcinput=github.com/ajstarks/deck/generate@v0.0.0-20220504212752-e4bcd985d902;downloadfilename=github-com-ajstarks-deck-generate-0.0.0-20220504212752-e4bcd985d902.zip;name=github-com-ajstarks-deck-generate"
SRC_URI[github-com-ajstarks-deck-generate.sha256sum] = "5d02eb750151dfcc7b3b1c85f1b7edc7ce705386dd04f6334e4cec63b1484d06"

GOSRC_LICENSE += "\
    CC-BY-4.0 \
    CC-BY-SA-3.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/deck/generate/LICENSE.txt;md5=b3b9d90b893d122d6beefb58b1200b0b \
    file://src/github.com/ajstarks/deck/generate/LICENSE;md5=3b22a81e54b780d09703d7337097cd5d \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-deck-generate-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ajstarks-deck-sources.inc', '', 'github.com-ajstarks-deck-sources.inc', d)}
