SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fcd29591bee09c5c7b63ffc992529aa7"
SRC_URI[sha256sum] = "a9ba6fb027bc6a07da025e7fae51c787514fdc3ff815b098ac1950467e03e534"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
