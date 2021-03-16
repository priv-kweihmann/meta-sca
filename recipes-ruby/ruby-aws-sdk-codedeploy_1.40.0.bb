SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9957ec214a7b87422876d1ae49f4d381"
SRC_URI[sha256sum] = "14fb7dbb9951c446c4455e0c77c9f859826e44ddb9fcdd3a1d0faa01c615958a"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
