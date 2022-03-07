SUMMARY = "NPM: @cspell/dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/ruby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-ruby/-/dict-ruby-2.0.1.tgz"
SRC_URI[md5sum] = "975e1c04504097e36f38de3163fc82e0"
SRC_URI[sha256sum] = "868526c4ba899e34dea51b714b56aa6421aec0c4c5969e3c166b2026ef242066"

NPM_PKGNAME = "@cspell/dict-ruby"

inherit npmhelper
inherit native
