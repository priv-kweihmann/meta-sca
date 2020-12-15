SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "http://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "7a140703f3152c852ce6a4439611c825"
SRC_URI[sha256sum] = "0a5a5d0ca4ba61a76fb31a17ab8f7f80281beb040c329d34dfc137a1398688e0"

GEM_NAME = "retriable"

inherit rubygems
