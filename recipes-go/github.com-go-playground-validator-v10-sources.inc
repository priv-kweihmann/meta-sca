SRC_URI += "https://proxy.golang.org/github.com/go-playground/validator/v10/@v/v10.9.0.zip;srcoutput=github.com/go-playground/validator/v10;srcinput=github.com/go-playground/validator/v10@v10.9.0;downloadfilename=github-com-go-playground-validator-v10-10.9.0.zip;name=github-com-go-playground-validator-v10"
SRC_URI[github-com-go-playground-validator-v10.sha256sum] = "0c636fc6419ff3771cfc0d7c113353c9b86ca5f8b56e774055def76cc92a484d"

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
