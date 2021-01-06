SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.1.tgz"
SRC_URI[md5sum] = "12a6c046f9719293896782812ba3af20"
SRC_URI[sha256sum] = "410a8cdf41fcadc638247657d62e0ac560f64a520ff958fa50f8c3522bf12464"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
