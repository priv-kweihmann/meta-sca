SUMMARY = "NPM: fast-equals"
DESCRIPTION = "A blazing fast equality comparison, either shallow or deep"
HOMEPAGE = "https://github.com/planttheidea/fast-equals#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77dbf7585d1337fc314a126be9d1d558"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fast-equals/-/fast-equals-3.0.1.tgz"
SRC_URI[md5sum] = "bcc6191523bf2ae0b0554345eda11f2e"
SRC_URI[sha256sum] = "30b9b00597fdb63291b1b7d28882914028f3cfd39f12a79fffae504f316fc490"

NPM_PKGNAME = "fast-equals"

inherit npmhelper
inherit native
