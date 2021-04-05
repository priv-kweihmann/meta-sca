SUMMARY = "NPM: lodash.clonedeep"
DESCRIPTION = "The lodash method `_.cloneDeep` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.clonedeep/-/lodash.clonedeep-4.5.0.tgz"
SRC_URI[md5sum] = "f8c4bb78e18a7f081f8aeac28a6d3ff9"
SRC_URI[sha256sum] = "cd3630dddc6fcb73e1bd27fce6972b2d20aa0ecadb001c523174648efbfe0312"

NPM_PKGNAME = "lodash.clonedeep"

inherit npmhelper
inherit native
