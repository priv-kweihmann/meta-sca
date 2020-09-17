SUMMARY = "NPM: lodash.groupby"
DESCRIPTION = "The lodash method `_.groupBy` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.groupby/-/lodash.groupby-4.6.0.tgz"
SRC_URI[md5sum] = "10ee690ea05d597a666e1630806b95d0"
SRC_URI[sha256sum] = "fe77c6d19478e8291aa771730b6a04c0d7eb43ff3925e5bda812f74ffb2924fd"

NPM_PKGNAME = "lodash.groupby"

inherit npmhelper
inherit native
