SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "59ed3a1cbf88f03d26c31e5bc946ee2e"
SRC_URI[sha256sum] = "3c6a50475d8b90ad1b481ec443145d93d8a79ce16a820577fa7be6b316387225"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
