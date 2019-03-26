SUMMARY = "Object classifier based on inception-v4"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=68b329da9893e34099c7d8ad5cb9c940"

inherit ros2
inherit ros_ament_python

RDEPENDS_${PN} = " \
    python3-core \
    movidius \
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=80-deep-learning/object_classifier  \
    file://0001-use-asarray-for-list-type-img.patch \
"

S="${WORKDIR}/object_classifier"
