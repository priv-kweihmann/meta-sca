SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001165.tgz"
SRC_URI[md5sum] = "a499cce295bfcd2cbf3ceb027d0850bd"
SRC_URI[sha256sum] = "ec27cbc81340e546b6abc1f63518f07d90125abf6b9db0e8cf656278b6ed1495"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
