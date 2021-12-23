SUMMARY = "NPM: lodash.get"
DESCRIPTION = "The lodash method `_.get` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.get/-/lodash.get-4.4.2.tgz"
SRC_URI[md5sum] = "331dd1c0a1f33c4146771930bad06aca"
SRC_URI[sha256sum] = "df4deba1b8156cffe8360b08f04de11b78d3f31ebdde90bef0a053a59848a49b"

NPM_PKGNAME = "lodash.get"

inherit npmhelper
inherit native
