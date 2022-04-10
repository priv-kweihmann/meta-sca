SUMMARY = "NPM: @cspell/dict-git"
DESCRIPTION = "CSpell configuration for GIT."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/vue#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4f0e69ab0879b8accb481a2b6a75d77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-git/-/dict-git-1.0.1.tgz"
SRC_URI[md5sum] = "c62f2766af8be67a1e001fbd5dad13fe"
SRC_URI[sha256sum] = "b1119c89555be11e34ee41c12198c29329f4994b153e5cff0c75693ba0fd716a"

NPM_PKGNAME = "@cspell/dict-git"

inherit npmhelper
inherit native
