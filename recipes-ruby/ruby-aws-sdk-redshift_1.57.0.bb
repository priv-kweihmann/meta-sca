SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4e0cfb6913289f4169598a1db9effb5f"
SRC_URI[sha256sum] = "1da3f67fadf7f626eb93d45afce017314cd1e65aa447274d2dd661e0c07e072e"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
