SRC_URI += "https://proxy.golang.org/github.com/go-playground/validator/v10/@v/v10.7.0.zip;srcoutput=github.com/go-playground/validator/v10;srcinput=github.com/go-playground/validator/v10@v10.7.0;downloadfilename=github-com-go-playground-validator-v10-10.7.0.zip;name=github-com-go-playground-validator-v10"
SRC_URI[github-com-go-playground-validator-v10.sha256sum] = "896dd4caba72c1cbc3841489c9744b4fc982d17762bd7a2bfd0f700b898eb8aa"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-playground/validator/v10/LICENSE;md5=a718a0f318d76f7c5d510cbae84f0b60 \
"

GOSRC_INCLUDEGUARD += "github.com-go-playground-validator-v10-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-playground-locales-sources.inc', '', 'github.com-go-playground-locales-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-playground-universal-translator-sources.inc', '', 'github.com-go-playground-universal-translator-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-leodido-go-urn-sources.inc', '', 'github.com-leodido-go-urn-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
