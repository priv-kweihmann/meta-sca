SUMMARY = "NPM: lodash.zip"
DESCRIPTION = "The lodash method `_.zip` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.zip/-/lodash.zip-4.2.0.tgz"
SRC_URI[md5sum] = "8e1c56d5327bda0b5426225427f6ce95"
SRC_URI[sha256sum] = "239791b4ae8a13d47d4e35fdbcacc0b277df8c07da17e5a83597308d8c2e8085"

NPM_PKGNAME = "lodash.zip"

inherit npmhelper
inherit native
