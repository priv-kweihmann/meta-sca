SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6683ebcba9eb852988d06e478b401f0b"
SRC_URI[sha256sum] = "f240f654c805c349edee6d1e8ff42b36a1996d1651ef8561ea03b3645899f25f"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
