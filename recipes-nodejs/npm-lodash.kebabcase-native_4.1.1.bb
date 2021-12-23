SUMMARY = "NPM: lodash.kebabcase"
DESCRIPTION = "The lodash method `_.kebabCase` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.kebabcase/-/lodash.kebabcase-4.1.1.tgz"
SRC_URI[md5sum] = "7a901d0b469af1be9ce8f6f157ec0df3"
SRC_URI[sha256sum] = "34f63989c54bdbaad5e071d078e10a1910059675aa57cf5424bb564c8f3da40d"

NPM_PKGNAME = "lodash.kebabcase"

inherit npmhelper
inherit native
