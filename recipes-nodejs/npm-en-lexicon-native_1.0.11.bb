SUMMARY = "NPM: en-lexicon"
DESCRIPTION = "Extensible english lexicon with Emoji support"
HOMEPAGE = "https://github.com/finnlp/en-lexicon#readme"

DEPENDS = "npm-en-inflectors-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7c5dbe3099281e1c0d0416911c6371ed"

SRC_URI = "https://registry.npmjs.org/en-lexicon/-/en-lexicon-1.0.11.tgz"
SRC_URI[md5sum] = "13d8da9d8e472e7d6cd7d35bcd569d93"
SRC_URI[sha256sum] = "a7c19d0ff172ee2e2a14cc1f3ec2d07441227f723d5ee04440cce9f5013cfe76"

NPM_PKGNAME = "en-lexicon"

inherit npmhelper
inherit native
