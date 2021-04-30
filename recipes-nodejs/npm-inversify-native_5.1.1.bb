SUMMARY = "NPM: inversify"
DESCRIPTION = "A powerful and lightweight inversion of control container for JavaScript and Node.js apps powered by TypeScript."
HOMEPAGE = "http://inversify.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=305aec93062e1c124bb52446f4f2eaa1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/inversify/-/inversify-5.1.1.tgz"
SRC_URI[md5sum] = "27b13b32980bd62ac5f544fea2100961"
SRC_URI[sha256sum] = "a2ce82b888259fac57f70ee6aced1dac8f327c420d3ec5fe0c8ca98168f4f86a"

NPM_PKGNAME = "inversify"

inherit npmhelper
inherit native
