SUMMARY = "RubyGem: aws-sdk-databasemigrationservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Database Migration Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "589fffbf1a57a7ccaf71a863de83a9c6"
SRC_URI[sha256sum] = "d61d7d6ff3c338c1c3118a553e972b9104762dae81429659b4e33e2e4787202b"

GEM_NAME = "aws-sdk-databasemigrationservice"

inherit rubygems
