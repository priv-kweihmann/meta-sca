SUMMARY = "NPM: @types/normalize-package-data"
DESCRIPTION = "TypeScript definitions for normalize-package-data"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/normalize-package-data"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/normalize-package-data/-/normalize-package-data-2.4.1.tgz"
SRC_URI[md5sum] = "ef1dd6e1b1edc4f0df3072998734e26a"
SRC_URI[sha256sum] = "ac9e4f47f531b83f5017bd4d5fa47ee79fd8aaca05f5dd0dcf446d301798881f"

NPM_PKGNAME = "@types/normalize-package-data"

inherit npmhelper
inherit native

S = "${WORKDIR}/normalize-package-data"
