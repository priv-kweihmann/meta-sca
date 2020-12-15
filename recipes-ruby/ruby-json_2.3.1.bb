SUMMARY = "RubyGem: json"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
HOMEPAGE = "http://flori.github.io/json/"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://references/rfc7159.txt;beginline=68;endline=88;md5=035998e2ea190861ad81c97518881c29"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e63902bfb33a29b07647d9696d18d700"
SRC_URI[sha256sum] = "3f9ebb42fcd46ec3ecad16c89c7b174dc539bdd353610c39c15aecca1d570e95"

GEM_NAME = "json"

inherit rubygems
