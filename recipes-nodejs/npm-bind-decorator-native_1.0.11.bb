SUMMARY = "NPM: bind-decorator"
DESCRIPTION = "The fastest automatic method.bind(this) decorator"
HOMEPAGE = "https://github.com/NoHomey/bind-decorator#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5015d8872d092147348c347928ab10cb"

SRC_URI = "https://registry.npmjs.org/bind-decorator/-/bind-decorator-1.0.11.tgz"
SRC_URI[md5sum] = "39b6aa862e1318860e4e6ce9340308d6"
SRC_URI[sha256sum] = "fabfe32abb765944edfb8069dea070082c422b5cf32d85c1003cf14857533d8f"

NPM_PKGNAME = "bind-decorator"

inherit npmhelper
inherit native
