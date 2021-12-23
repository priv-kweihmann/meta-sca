SUMMARY = "NPM: inflight"
DESCRIPTION = "Add callbacks to requests in flight to avoid async duplication"
HOMEPAGE = "https://github.com/isaacs/inflight"

DEPENDS = "npm-once-native npm-wrappy-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63"

SRC_URI = "https://registry.npmjs.org/inflight/-/inflight-1.0.6.tgz"
SRC_URI[md5sum] = "dd31215ede2e0da80f8e31c9f93d8ace"
SRC_URI[sha256sum] = "5a9fdcf59874af6ad3b413b6815d5afaaea34939a3bee20e1e50f7830031889b"

S = "${WORKDIR}/package"

NPM_PKGNAME = "inflight"

inherit npmhelper
inherit native
