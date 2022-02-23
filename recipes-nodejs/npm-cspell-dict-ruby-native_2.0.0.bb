SUMMARY = "NPM: @cspell/dict-ruby"
DESCRIPTION = "For ruby and ruby on rails"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/ruby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-ruby/-/dict-ruby-2.0.0.tgz"
SRC_URI[md5sum] = "42b4ccd31f553dc32ca90836231f0f9d"
SRC_URI[sha256sum] = "0d126578ecbebf6eacf9d9dd572b3e130bd5c4627c0b517f15edebb57a96e11f"

NPM_PKGNAME = "@cspell/dict-ruby"

inherit npmhelper
inherit native
