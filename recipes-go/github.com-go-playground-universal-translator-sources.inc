SRC_URI += "https://proxy.golang.org/github.com/go-playground/universal-translator/@v/v0.17.0.zip;srcoutput=github.com/go-playground/universal-translator;srcinput=github.com/go-playground/universal-translator@v0.17.0;downloadfilename=github-com-go-playground-universal-translator-0.17.0.zip;name=github-com-go-playground-universal-translator"
SRC_URI[github-com-go-playground-universal-translator.sha256sum] = "cfd4a4f76c27794e7b925fb672ee7576d89aa5e22efdc7fec4fc80b467abe06f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-playground/universal-translator/LICENSE;md5=2e2b21ef8f61057977d27c727c84bef1 \
"

GOSRC_INCLUDEGUARD += "github.com-go-playground-universal-translator-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-playground-locales-sources.inc', '', 'github.com-go-playground-locales-sources.inc', d)}
