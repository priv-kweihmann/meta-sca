SUMMARY = "NPM: lodash.uniq"
DESCRIPTION = "The lodash method `_.uniq` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.uniq/-/lodash.uniq-4.5.0.tgz"
SRC_URI[md5sum] = "85405de29516fd0264fe8e42a6229498"
SRC_URI[sha256sum] = "0e6cbc31894f7a826c7a3ccd0d119ce24656a244f7c446104c6fcaaab072bf46"

NPM_PKGNAME = "lodash.uniq"

inherit npmhelper
inherit native
