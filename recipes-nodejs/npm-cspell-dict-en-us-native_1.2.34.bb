SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.34.tgz"
SRC_URI[md5sum] = "0c36b69babb4fd95be0c475e12d3b6d8"
SRC_URI[sha256sum] = "b374f05d4ed7d6276cceeb8029a6439b4970603e9e19334e1dd68d186b818e66"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
