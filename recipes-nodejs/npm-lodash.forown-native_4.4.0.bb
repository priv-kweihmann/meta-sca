SUMMARY = "NPM: lodash.forown"
DESCRIPTION = "The lodash method `_.forOwn` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.forown/-/lodash.forown-4.4.0.tgz"
SRC_URI[md5sum] = "2ba4d1e319d0710e40ae610d513a38e3"
SRC_URI[sha256sum] = "e4e1630e69a456f81799bfa01bde1851d337b14cf265b52d68df619c4241dd94"

NPM_PKGNAME = "lodash.forown"

inherit npmhelper
inherit native
