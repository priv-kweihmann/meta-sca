SUMMARY = "NPM: @cspell/dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/scala#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-scala/-/dict-scala-2.0.0.tgz"
SRC_URI[md5sum] = "254865090994e4b636f0752e6faa5ce6"
SRC_URI[sha256sum] = "089de0c5ddd02a3286e8e441debf1d0733ff95a2c0c2753856b558a2d32e5021"

NPM_PKGNAME = "@cspell/dict-scala"

inherit npmhelper
inherit native
