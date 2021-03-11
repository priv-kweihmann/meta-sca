SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ec71a15177f9ea4e40bf8b0213d74e50"
SRC_URI[sha256sum] = "9b95889bb2a7152335db90df7e4776d0cf8a3d4fdcc724f4e1d4ea89f05849ac"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
