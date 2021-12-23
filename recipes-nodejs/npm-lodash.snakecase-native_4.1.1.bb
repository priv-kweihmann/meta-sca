SUMMARY = "NPM: lodash.snakecase"
DESCRIPTION = "The lodash method `_.snakeCase` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.snakecase/-/lodash.snakecase-4.1.1.tgz"
SRC_URI[md5sum] = "6d3c54c3d2d00bcc65ed8f4aef63da14"
SRC_URI[sha256sum] = "53032c788083a49a22af5b896cafebd905dafad3510d70459a384afd5c302c2c"

NPM_PKGNAME = "lodash.snakecase"

inherit npmhelper
inherit native
