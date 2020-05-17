SUMMARY = "NPM: fast-levenshtein"
DESCRIPTION = "Efficient implementation of Levenshtein algorithm  with locale-specific collator support."
HOMEPAGE = "https://github.com/hiddentao/fast-levenshtein#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a3e99e82761a3c89e44fe0bc43f82b94"

SRC_URI = "https://registry.npmjs.org/fast-levenshtein/-/fast-levenshtein-2.0.6.tgz"
SRC_URI[md5sum] = "443a739d106c51a33470c9f018d82e85"
SRC_URI[sha256sum] = "bb4b50306b8b0f048475efddae11810e245937dca8ae85498ab4a171697bbf3c"

NPM_PKGNAME = "fast-levenshtein"

inherit npmhelper
inherit native
