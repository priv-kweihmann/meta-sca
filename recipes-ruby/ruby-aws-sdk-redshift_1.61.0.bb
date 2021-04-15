SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "31ecddcbed8bbb94ecc50b9f4a384998"
SRC_URI[sha256sum] = "53a415f0b6f25ec90c04aa85a3b52b8253128389d31c4868e8392313d3aebbf6"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
