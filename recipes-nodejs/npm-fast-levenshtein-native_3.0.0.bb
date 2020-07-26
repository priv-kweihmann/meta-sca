SUMMARY = "NPM: fast-levenshtein"
DESCRIPTION = "Efficient implementation of Levenshtein algorithm  with locale-specific collator support."
HOMEPAGE = "https://github.com/hiddentao/fast-levenshtein#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a3e99e82761a3c89e44fe0bc43f82b94"

DEPENDS = "npm-fastest-levenshtein-native"

SRC_URI = "https://registry.npmjs.org/fast-levenshtein/-/fast-levenshtein-3.0.0.tgz"
SRC_URI[md5sum] = "68588f531030b8b705d633521f603895"
SRC_URI[sha256sum] = "7ea564718bf959097a5468ef02824bb87e5084d1e018dce789ee23b0af4cd5e5"

NPM_PKGNAME = "fast-levenshtein"

inherit npmhelper
inherit native
