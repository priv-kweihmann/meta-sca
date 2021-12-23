SUMMARY = "NPM: en-pos"
DESCRIPTION = "A better English POS tagger written in JavaScript"
HOMEPAGE = "https://github.com/finnlp/en-pos#readme"

DEPENDS = "npm-cities-list-native npm-en-inflectors-native npm-en-lexicon-native npm-humannames-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/en-pos/-/en-pos-1.0.16.tgz"
SRC_URI[md5sum] = "e205f91edf51b6ffd393596c13dec5ef"
SRC_URI[sha256sum] = "a556c4b7669c3f960429c1087f72994e6cdb8913d5d0c61069a0eff25f5be03c"

NPM_PKGNAME = "en-pos"

inherit npmhelper
inherit native
