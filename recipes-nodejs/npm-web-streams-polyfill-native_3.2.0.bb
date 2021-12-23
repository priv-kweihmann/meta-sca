SUMMARY = "NPM: web-streams-polyfill"
DESCRIPTION = "Web Streams, based on the WHATWG spec reference implementation"
HOMEPAGE = "https://github.com/MattiasBuelens/web-streams-polyfill#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f386ec07283033a802d3be56cae4a3c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-streams-polyfill/-/web-streams-polyfill-3.2.0.tgz"
SRC_URI[md5sum] = "a8b3ba0ec48457a077e22bb5de3ebbce"
SRC_URI[sha256sum] = "8c4826eea4499bd119306634ef8de969663b690bbbb33a8cd51509d3b3ec7746"

NPM_PKGNAME = "web-streams-polyfill"

inherit npmhelper
inherit native
