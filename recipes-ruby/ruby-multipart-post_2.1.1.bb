SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "Use with Net::HTTP to do multipart form postspec"
HOMEPAGE = "https://github.com/nicksieger/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c537a3068be751e2d7953e2f069073ff"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8383db0bd5bc3cbe9243f6e47222cf24"
SRC_URI[sha256sum] = "d2dd7aa957650e0d99e0513cd388401b069f09528441b87d884609c8e94ffcfd"

GEM_NAME = "multipart-post"

inherit rubygems
